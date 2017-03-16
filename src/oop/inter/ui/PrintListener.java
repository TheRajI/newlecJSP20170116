package oop.inter.ui;

import oop.inter.entity.Exam;

public interface PrintListener {				// 인터페이스
	// int x;  // 약속으로의 의미가 되어야지 데이터가 있어서는 안됨(과거에는 가능했지만 현재는 ㄴㄴ)
	void onPrint(Exam exam);
}
