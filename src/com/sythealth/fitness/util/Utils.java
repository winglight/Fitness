/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sythealth.fitness.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.util.Base64;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.sythealth.custom.fragment.LevelListFragment;
import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;

/**
 * Class containing some static utility methods.
 */
public class Utils {

	public static final int STANDARD_CALS = 2250;// 每人每天推荐摄入热量
	// 类型
	public static final int BREAKFAST = 1;
	public static final int LUNCH = 2;
	public static final int DINNER = 3;
	// 传参key
	public static final String MEAL_TYPE_KEY = "type";
	public static final String DATE_KEY = "date";
	public static final String COURSE_CONDITION_ZAODIAN = "早点";
	public static final String COURSE_CONDITION_ZHUSHI = "主食";
	public static final String COURSE_CONDITION_FRUIT = "水果";
	public static final String COURSE_CONDITION_ZZF = "水果主食早点";
	public static final String COURSE_TYPE_ZHENGCAN = "正餐";
	public static final String COURSE = "course";
	public static final String MEAL_LUNCH = "中餐";
	public static final String MEAL_DINNER = "晚餐";
	public static final String MEALCOURSE = "mealCourse";
	public static final String RE_LIANG = "热量";
	public static final String HEALTHADVICE = "true";

	public static final String HEALTH_YOUTH = "青少年";
	public static final String HEALTH_OPT = "术后调养";
	public static final String HEALTH_POOR_BLOOD = "贫血";
	public static final String HEALTH_SUP_BLOOD = "补血";
	public static final String HEALTH_BEAUTY = "美容";
	public static final String HEALTH_PREG = "孕妇";
	public static final String HEALTH_PRE_PREG = "备孕期";
	public static final String HEALTH_KIDEY = "肾炎";
	public static final String HEALTH_DIABETES = "糖尿病";
	public static final String HEALTH_OLD = "老年人";
	public static final String HEALTH_MENO_PAUSE = "更年期";
	public static final String NUTRIENT_PROTEIN = "蛋白质";
	public static final String NUTRIENT_IRON = "铁";
	public static final String NUTRIENT_VC = "维C";
	public static final String NUTRIENT_FOLIC = "叶酸";

	public static final String YOU_ER = "幼儿";

	public static final List<String> FRUIT_FOUR_SEASON = Arrays
			.asList(new String[] { "春", "夏", "秋", "冬" });
	public static final String GUIDE_FLAG = "guide_flag";
	public static final String NOTE_FLAG_01 = "note_flag_01";
	public static final String NOTE_FLAG_02 = "note_flag_02";
	public static final String MEAL_FLAG = "meal_flag";
	public static final String MAIN_FLAG = "main_flag";
	public static final String SETCONDITION_FLAG = "setcondition_flag";
	public static final String SETFRUIT_FALG = "setfruit_flag";
	public static final String ADD_COURSE_FALG = "add_course_flag";
	public static final String HEALTHCONDITION_FLAG = "healthcondition_flag";
	private static final String TAG = "Utils";

	private Utils() {
	};

	@TargetApi(11)
	public static void enableStrictMode() {
		if (Utils.hasGingerbread()) {
			StrictMode.ThreadPolicy.Builder threadPolicyBuilder = new StrictMode.ThreadPolicy.Builder()
					.detectAll().penaltyLog();
			StrictMode.VmPolicy.Builder vmPolicyBuilder = new StrictMode.VmPolicy.Builder()
					.detectAll().penaltyLog();

			if (Utils.hasHoneycomb()) {
				threadPolicyBuilder.penaltyFlashScreen();
				// vmPolicyBuilder
				// .setClassInstanceLimit(DailyArtWorkActivity.class, 1)
				// .setClassInstanceLimit(ImageDetailActivity.class, 1);
			}
			StrictMode.setThreadPolicy(threadPolicyBuilder.build());
			StrictMode.setVmPolicy(vmPolicyBuilder.build());
		}
	}

	public static boolean hasFroyo() {
		// Can use static final constants like FROYO, declared in later versions
		// of the OS since they are inlined at compile time. This is guaranteed
		// behavior.
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
	}

	public static boolean hasGingerbread() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
	}

	public static boolean hasHoneycomb() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
	}

	public static boolean hasHoneycombMR1() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
	}

	public static boolean hasJellyBean() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
	}
	//String 转集合
	public static String[] stringIntoArray(String str){
		if(str !=null){
			String [] strs = str.split(",");
			return strs;
		}
		return null;
	}
	//集合转String
	public static String arrayIntoString(List<String> lists) {
		StringBuilder sb = new StringBuilder();
		if (lists != null) {
			for (int i = 0; i < lists.size(); i++) {
				sb.append(lists.get(i)).append(",");
			}
			if (sb.toString().endsWith(",")) {
				sb.deleteCharAt(sb.length() - 1);
			}
			return sb.toString();
		}

		return "";
	}
	//数组转String
	public static String arrayIntoString(String[] strs) {
		StringBuilder sb = new StringBuilder();
		if (strs != null) {
			for (int i = 0; i < strs.length; i++) {
				sb.append(strs[i]).append(",");
			}
			if (sb.toString().endsWith(",")) {
				sb.deleteCharAt(sb.length() - 1);
			}
			return sb.toString();
		}
		return null;
	}

	public static <T> List<T> convertArray(T[] array) {
		List<T> list = new ArrayList<T>();
		if (array == null)
			return list;
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}

	public static <T> boolean listContains(T target, List<T> list) {
		if (list == null)
			return false;

		boolean flag = false;
		for (T org : list) {
			if (org.equals(target)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static <T> void listRemove(T target, List<T> list) {
		if (list == null)
			return;

		for (T org : list) {
			if (org.equals(target)) {
				list.remove(org);
				break;
			}
		}
	}

	public static <T> void listAdd(T target, List<T> list) {
		if (list == null)
			return;
		if (!listContains(target, list)) {
			list.add(target);
		}
	}

	public static long getDirSize(File dir) {
		long size = 0;
		if (dir.isFile()) {

			size = dir.length();
		} else {
			File[] subFiles = dir.listFiles();
			if (subFiles == null)
				return 0;
			for (File file : subFiles) {
				if (file.isFile()) {
					size += file.length();
				} else {
					size += getDirSize(file);
				}

			}
		}
		return size;
	}

	/*
	 * 裁剪图片为圆形
	 */
	public static Bitmap toRoundBitmap(Bitmap bitmap) {
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();
		float roundPx;
		float left, top, right, bottom, dst_left, dst_top, dst_right, dst_bottom;
		if (width <= height) {
			roundPx = width / 2;
			top = 0;
			bottom = width;
			left = 0;
			right = width;
			height = width;
			dst_left = 0;
			dst_top = 0;
			dst_right = width;
			dst_bottom = width;
		} else {
			roundPx = height / 2;
			float clip = (width - height) / 2;
			left = clip;
			right = width - clip;
			top = 0;
			bottom = height;
			width = height;
			dst_left = 0;
			dst_top = 0;
			dst_right = height;
			dst_bottom = height;
		}

		Bitmap output = Bitmap.createBitmap(width, height, Config.ARGB_8888);
		Canvas canvas = new Canvas(output);

		final int color = 0xff424242;
		final Paint paint = new Paint();
		final Rect src = new Rect((int) left, (int) top, (int) right,
				(int) bottom);
		final Rect dst = new Rect((int) dst_left, (int) dst_top,
				(int) dst_right, (int) dst_bottom);
		final RectF rectF = new RectF(dst);

		paint.setAntiAlias(true);

		canvas.drawARGB(0, 0, 0, 0);
		paint.setColor(color);
		canvas.drawRoundRect(rectF, roundPx, roundPx, paint);

		paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
		canvas.drawBitmap(bitmap, src, dst, paint);
		return output;
	}

	public static void goBack(Button btn, final Activity activity) {
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				activity.onBackPressed();
			}
		});
	}

	// 设置字体为方正粗倩简体
	public static void setTypeface1(Context context, TextView tv) {
		Typeface typeface = Typeface.createFromAsset(context.getAssets(),
				"fonts/fzcqjw.ttf");
		tv.setTypeface(typeface);
	}

	// 设置字体为时尚中黑简体
	public static void setTypeface2(Context context, TextView tv) {
		Typeface typeface = Typeface.createFromAsset(context.getAssets(),
				"fonts/shishanghei.ttf");
		tv.setTypeface(typeface);
	}

	public static void BackForAct(final Context context,
			Button btn, final Fragment fragment) {
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				((BaseActivity) context).backFragment(fragment);
			}
		});
	}
	/**
	 * 
	 * @param activity 当前context
	 * @param cls 目标activity
	 * @param b 是否添加跳转动画
	 * @param b1 是否结束当前activity
	 */
	public static void jumpUI(final Activity activity,
			final Class<?> cls,final boolean b,final boolean b1){
		Intent intent = new Intent();
		intent.setClass(activity, cls);
		activity.startActivity(intent);
		if(b){
			activity.overridePendingTransition(R.anim.push_left_in,
					R.anim.push_right_out);
		}
		if(b1){
			activity.finish();
		}
	}
	//界面跳转
	// 位图转换 缩略图
	public static Bitmap getThumbnailBitmap(String pathName) {
		// DisplayImageOptions options = new DisplayImageOptions.Builder();
		BitmapFactory.Options opts = new BitmapFactory.Options();
		//设置缓存
		opts.inTempStorage = new byte[100 * 1024];
		//设置色彩度
		opts.inPreferredConfig = Bitmap.Config.RGB_565;
		
		opts.inPurgeable = true;
		//设置size为原来的1/4  inSampleSize 越小 图片越清晰
		opts.inSampleSize = 4;
		opts.inInputShareable = true;
		Bitmap bitmap = BitmapFactory.decodeFile(pathName, opts);
		bitmap = ThumbnailUtils.extractThumbnail(bitmap, 135, 135);
		return bitmap;
	}

	// 位图转换 原图
	public static Bitmap getBitmap(String pathName) {
		try {
			// DisplayImageOptions options = new DisplayImageOptions.Builder();
			BitmapFactory.Options opts = new BitmapFactory.Options();
			opts.inTempStorage = new byte[100 * 1024];
			 opts.inPreferredConfig = Bitmap.Config.RGB_565;
			opts.inPurgeable = true;
			opts.inInputShareable = true;
			opts.inSampleSize = 2;
			Bitmap bitmap = BitmapFactory.decodeFile(pathName, opts);
			return bitmap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//
	public static String getStrFromBase64(String str){
		byte[] bytes = Base64.decode(str, Base64.DEFAULT);
		return new String(bytes);
	}
	//自定义progressdialog
	public static ProgressDialog customProgressDialog(Context context,String msg){
		ProgressDialog pd = new ProgressDialog(context);
		pd.show();
		View v = LayoutInflater.from(context).inflate(R.layout.custom_progress_dialog, null);
		TextView tv = (TextView)v.findViewById(R.id.custom_progressdialog_tv);
		tv.setText(msg);
		pd.setContentView(v, new LayoutParams(300, 300));
		return pd;
	}
	//验证邮箱格式
	public static boolean checkingEmail(String email){
		//验证邮箱的正则表达式
		String str="^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}