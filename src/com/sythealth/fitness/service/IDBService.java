package com.sythealth.fitness.service;

import java.util.List;

import com.sythealth.fitness.db.CountSportModel;
import com.sythealth.fitness.db.DiaryModel;
import com.sythealth.fitness.db.FriendModel;
import com.sythealth.fitness.db.LevelModel;
import com.sythealth.fitness.db.MedalModel;
import com.sythealth.fitness.db.RemoteInvokeModel;
import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.db.WeightModel;
import com.sythealth.fitness.db.enumetype.RemoteInvokeStatus;
import com.sythealth.fitness.db.enumetype.SportType;
import com.sythealth.fitness.json.result.FitMyRankDto;

public interface IDBService {

	public void close();
	
	public void setCurrentUser(UserModel user);
	
	//users
	public UserModel queryUserByEmail(String email, String...password);
	public UserModel queryUserByPhone(String phone, String...password);
	public UserModel queryUserBySid(String sid);
	public UserModel queryDefaultUser();
	public boolean createUser(UserModel user);
	public boolean updateUser(UserModel user);
	
	public boolean createWeightRecord(WeightModel weight);
	
	public boolean createDiaryRecord(DiaryModel diary);
	public boolean updateDiaryRecord(DiaryModel diary);
	
	public boolean createFriend(FriendModel friend);
	
	public List<CountSportModel> getCountSports();
	public List<CountSportModel> getCountSportsByList(List<String> list);
	
	public MedalModel countMedalSport(SportType type, int amount);
	public List<MedalModel> getNotInformedMedal();
	public LevelModel levelUp();
	
	public List<MedalModel> getAllMedals();
	
	public List<LevelModel> getAllLevels();
	
	public boolean updateMedalInformed(MedalModel mm, boolean isInformed);
	public boolean updateLevelInformed(LevelModel lm, boolean isInformed);
	
	public boolean savePKRecord(FitMyRankDto pk);
	
	public RemoteInvokeModel queryLatestRIM(RemoteInvokeModel rim, RemoteInvokeStatus status);
	public boolean createRemoteInvoke(RemoteInvokeModel rim);
	public boolean updateRemoteInvoke(RemoteInvokeModel rim);
}
