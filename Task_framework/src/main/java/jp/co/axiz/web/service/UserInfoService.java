package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entity.UserInfo;

public interface UserInfoService {

	public UserInfo findById(Integer id);	//id検索

	public List<UserInfo> search (String id, String name, String tel);		//検索

	public void register(String name,String tel,String pass);		//新規登録

	public List<UserInfo> findMaxId();			//登録後、登録したID取得

	public int updateName(UserInfo user);		//名前変更

	public int updateTel(UserInfo user);		//Tel変更

	public int updatePass(UserInfo user);		//pass変更

	public void deleteById(Integer id);		//削除
}
