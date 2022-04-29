package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usertbl;
import com.example.demo.repository.UsertblRepository;

//User_tblのService宣言
@Service
public class UsertblService {

//User_tblのRpository呼び出しとUtblRepoでの実装
	@Autowired
	UsertblRepository UtblRepo;

	// ユーザーTBLの内容を全検索
	public List<Usertbl> searchAll() {
		return UtblRepo.findAll();
	}

	public Usertbl searchId(String id) {
		return UtblRepo.findById(id).get();
	}

	public List<Usertbl> SigninId(String id, String pass) {// USER_IDとUSER_PASSの二つをキーにレコードを取得
		return UtblRepo.findByIdAndPass(id, pass);
	}

	public List<Usertbl> SigninEmail(String email, String pass) {// USER_NAMEとUSER_PASSの二つをキーにレコードを取得
		return UtblRepo.findByEmailAndPass(email, pass);
	}

	public void Singup(Usertbl newA) {
//		if (!UtblRepo.existsById(newA[0].getId())) {
		UtblRepo.save(newA);
//		}
	}

	public void UpdateAccount(Usertbl newA) {
		if (UtblRepo.existsById(newA.getId())) {
			UtblRepo.save(newA);
		}
	}

	public void DeleteAccount(String id) {
		if (UtblRepo.existsById(id)) {
			UtblRepo.deleteById(id);
		}
	}
}