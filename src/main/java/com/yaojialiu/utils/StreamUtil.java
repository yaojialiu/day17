package com.yaojialiu.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(InputStream src) throws IOException{
	//TODO 实现代码
		src.close();
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
	//TODO 实现代码
		byte[] b = new byte[1024];
		int read = src.read(b);
		String string = src.toString();
		closeAll(src);
		return string;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
	//TODO 实现代码
		File[] listFiles = txtFile.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
			readTextFile(file);
		}
		return "file";
	}

}
