package oop.inter.ui;

import oop.inter.entity.Exam;

public interface PrintListener {				// �������̽�
	// int x;  // ��������� �ǹ̰� �Ǿ���� �����Ͱ� �־�� �ȵ�(���ſ��� ���������� ����� ����)
	void onPrint(Exam exam);
}
