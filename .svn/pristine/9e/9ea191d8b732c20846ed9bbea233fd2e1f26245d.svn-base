package com.sythealth.fitness.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.sythealth.fitness.db.enumetype.BodyType;
import com.sythealth.fitness.db.enumetype.SportType;
import com.sythealth.fitness.util.DateUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class UserDBOpenHelper extends OrmLiteSqliteOpenHelper{
	
	public  static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "user.db";
	
	// we do this so there is only one helper
	private static UserDBOpenHelper helper = null;
	
	private Dao<UserModel, Integer> userDao;
	private Dao<DiaryModel, Integer> diaryDao;
	private Dao<FriendModel, Integer> friendDao;
	private Dao<MedalModel, Integer> medalDao;
	private Dao<MessageModel, Integer> messageDao;
	private Dao<PropModel, Integer> propDao;
	private Dao<SportModel, Integer> sportDao;
	private Dao<CountSportModel, Integer> countSportDao;
	private Dao<WeightModel, Integer> weightDao;
	private Dao<RemoteInvokeModel, Integer> rimDao;
	private Dao<LevelModel, Integer> levelDao;
	
    public UserDBOpenHelper(Context context) {
    	super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    
    public static synchronized UserDBOpenHelper getHelper(Context context) {
		if (helper == null) {
			helper = new UserDBOpenHelper(context);
			helper.getWritableDatabase();
		}
		return helper;
	}
    
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try {
			Log.i(UserDBOpenHelper.class.getName(), "onCreate");
			TableUtils.createTable(connectionSource, UserModel.class);
			TableUtils.createTable(connectionSource, DiaryModel.class);
			TableUtils.createTable(connectionSource, FriendModel.class);
			TableUtils.createTable(connectionSource, MedalModel.class);
			TableUtils.createTable(connectionSource, MessageModel.class);
			TableUtils.createTable(connectionSource, PropModel.class);
			TableUtils.createTable(connectionSource, SportModel.class);
			TableUtils.createTable(connectionSource, CountSportModel.class);
			TableUtils.createTable(connectionSource, WeightModel.class);
			TableUtils.createTable(connectionSource, RemoteInvokeModel.class);
			TableUtils.createTable(connectionSource, LevelModel.class);

			Dao<LevelModel, Integer> ldao = getLevelDAO();
			LevelModel lm = new LevelModel();
			lm.setExp(100);
			lm.setGold(0);
			lm.setIndex(1);
			lm.setName("一级");
			ldao.create(lm);
			
			lm = new LevelModel();
			lm.setExp(200);
			lm.setGold(100);
			lm.setIndex(2);
			lm.setName("二级");
			ldao.create(lm);
			
			lm = new LevelModel();
			lm.setExp(400);
			lm.setGold(200);
			lm.setIndex(2);
			lm.setName("二级");
			ldao.create(lm);
			
			Dao<CountSportModel, Integer> cdao = getCountSportDAO();
			CountSportModel cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("原地跳远");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("屈膝快蹲");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("跳跃换腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("双腿侧伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("飞燕后踢");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("原地起跑");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("弓步拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("原地踏步");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("纵跳");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.0028);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("跨腿抬手");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.001);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("慢跑");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.001);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.THIGH);
			cm.setSportName("空中蹬车");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0015);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("打网球");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("仰卧起坐");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("合掌屈膝");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("后仰拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("坐姿划船");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("坐地转体");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("屈体收腹");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("仰卧收腹");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.0015);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("前后摇胯");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("腰部侧伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("坐式拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BELLY);
			cm.setSportName("开腿屈伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("外展瘦臂");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("手臂扭转");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("上勾拳");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("双臂平举");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("直拳");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("大风车");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("手臂转动");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("上下拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("双臂外展");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("双手上举");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("内外画圆");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.ARM);
			cm.setSportName("单臂飞碟");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("后抬提臀");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("屈膝提臀");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("跨步蹲起");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("马步夹臀");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("原地伸展");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.001);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("高抬腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("膝盖上踢");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("侧踢伸展");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("仰卧抬臀");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.001);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("甩臀抬膝");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("抬腿提臀");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.HIP);
			cm.setSportName("夹臀下蹲");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0014);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("踮脚击掌");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("交叉下腰");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("单腿前踏");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("单脚跳");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.001);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("交叉抬腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("交叉踢腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("深蹲");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0014);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("单腿伸展");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.001);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("单膝上踢");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("单腿上抬");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("伏地拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.CALF);
			cm.setSportName("高台压腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("屈体托胸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("合掌划圈");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("曲臂扩胸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("划船拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("空手道防御");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("交叉伸展");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("扩胸运动");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("胸部拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("垂直伸展");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.0008);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("同向摆臂");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("合掌上举");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.BUST);
			cm.setSportName("合掌平移");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("弯腰摸脚");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(0);
			cm.setStandardCals(0.0019);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("坐姿瘦腰");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(1);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("膝肘同向");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(2);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(DateUtils.addDateDays(new Date(), 10000));
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("水平螺旋");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(3);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("腰部快扭");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(4);
			cm.setStandardCals(0.0019);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("拉伸手臂");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(5);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("侧步拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(6);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("伸展扭腰");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(7);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("螺旋扭转");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(8);
			cm.setStandardCals(0.0007);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("单侧拉伸");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(9);
			cm.setStandardCals(0.0006);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("扭腰抬腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(10);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			cm = new CountSportModel();
			cm.setCount(30);
			cm.setType(SportType.WAIST);
			cm.setSportName("甩臂抬腿");
			cm.setSportImage("");
			cm.setSportAnim("");
			cm.setOrder(11);
			cm.setStandardCals(0.0013);
			cm.setValidateEndDate(null);
			cdao.create(cm);
			
			// here we try inserting data in the on-create as a test
			Dao<UserModel, Integer> dao = getUserDAO();
			// create some entries in the onCreate
			 UserModel simple = new UserModel();
			 simple.setNickName("Test User");
			 simple.setEmail("test@fsl.com");
			 simple.setPassword("1243124");
			 simple.setBirthday(DateUtils.addDateDays(new Date(), -10000));
			 simple.setAnimation("1.gif");
			 simple.setAvatar("my.png");
			 simple.setCurrentWeight(60);
			 simple.setDailyInCals(2000);
			 simple.setDailyOutCals(1500);
			 simple.setHeight(160);
			 simple.setHistory(DateUtils.formatDate(new Date()) + "踏上瘦身之旅");
			 simple.setPartnerId("");
			 simple.setPartnerName("");
			 simple.setPartnerAvatar("");
			 simple.setPlanBeginDate(new Date());
			 simple.setPlanEndDate(DateUtils.addDateDays(new Date(), 60));
			 simple.setPlanBeginWeight(60);
			 simple.setPlanEndWeight(40);
			 simple.setLevel(lm);
			 
			dao.create(simple);
			
			Log.i(UserDBOpenHelper.class.getName(), "created new entries in onCreate: " + simple.getNickName());
		} catch (SQLException e) {
			Log.e(UserDBOpenHelper.class.getName(), "Can't create database", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * This is called when your application is upgraded and it has a higher version number. This allows you to adjust
	 * the various data to match the new version number.
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
		try {
			Log.i(UserDBOpenHelper.class.getName(), "onUpgrade");
			TableUtils.dropTable(connectionSource, UserModel.class, true);
			TableUtils.dropTable(connectionSource, DiaryModel.class, true);
			TableUtils.dropTable(connectionSource, FriendModel.class, true);
			TableUtils.dropTable(connectionSource, MedalModel.class, true);
			TableUtils.dropTable(connectionSource, MessageModel.class, true);
			TableUtils.dropTable(connectionSource, PropModel.class, true);
			TableUtils.dropTable(connectionSource, SportModel.class, true);
			TableUtils.dropTable(connectionSource, CountSportModel.class, true);
			TableUtils.dropTable(connectionSource, WeightModel.class, true);
			TableUtils.dropTable(connectionSource, RemoteInvokeModel.class, true);
			TableUtils.dropTable(connectionSource, LevelModel.class, true);
			
			// after we drop the old databases, we create the new ones
			onCreate(db, connectionSource);
		} catch (SQLException e) {
			Log.e(UserDBOpenHelper.class.getName(), "Can't drop databases", e);
			throw new RuntimeException(e);
		}
	}

    public Dao<UserModel, Integer> getUserDAO() throws SQLException{
    	if(userDao == null){
    		userDao = getDao(UserModel.class);
    	}
    	return userDao;
    }
    
    public Dao<DiaryModel, Integer> getDiaryDAO() throws SQLException{
    	if(diaryDao == null){
    		diaryDao = getDao(DiaryModel.class);
    	}
    	return diaryDao;
    }
    
    public Dao<FriendModel, Integer> getFriendDAO() throws SQLException{
    	if(friendDao == null){
    		friendDao = getDao(FriendModel.class);
    	}
    	return friendDao;
    }
    
    public Dao<MedalModel, Integer> getMedalDAO() throws SQLException{
    	if(medalDao == null){
    		medalDao = getDao(MedalModel.class);
    	}
    	return medalDao;
    }
    
    public Dao<MessageModel, Integer> getMessageDAO() throws SQLException{
    	if(messageDao == null){
    		messageDao = getDao(MessageModel.class);
    	}
    	return messageDao;
    }
    
    public Dao<PropModel, Integer> getPropDAO() throws SQLException{
    	if(propDao == null){
    		propDao = getDao(PropModel.class);
    	}
    	return propDao;
    }
    
    public Dao<SportModel, Integer> getSportDAO() throws SQLException{
    	if(sportDao == null){
    		sportDao = getDao(SportModel.class);
    	}
    	return sportDao;
    }
    
    public Dao<CountSportModel, Integer> getCountSportDAO() throws SQLException{
    	if(countSportDao == null){
    		countSportDao = getDao(CountSportModel.class);
    	}
    	return countSportDao;
    }
    
    public Dao<WeightModel, Integer> getWeightDAO() throws SQLException{
    	if(weightDao == null){
    		weightDao = getDao(WeightModel.class);
    	}
    	return weightDao;
    }
    
    public Dao<RemoteInvokeModel, Integer> getRIMDAO() throws SQLException{
    	if(rimDao == null){
    		rimDao = getDao(RemoteInvokeModel.class);
    	}
    	return rimDao;
    }
    
    public Dao<LevelModel, Integer> getLevelDAO() throws SQLException{
    	if(levelDao == null){
    		levelDao = getDao(LevelModel.class);
    	}
    	return levelDao;
    }
    
    @Override
	public void close() {
		super.close();
		userDao = null;
		diaryDao = null;
		friendDao = null;
		medalDao = null;
		messageDao = null;
		propDao = null;
		sportDao = null;
		countSportDao = null;
		weightDao = null;
		rimDao = null;
		levelDao = null;
	}
}
