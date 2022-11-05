package org.springframework.zh;

import org.springframework.asm.ClassVisitor;
import org.springframework.cglib.core.DebuggingClassWriter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class ASM {

	public static void main(String[] args) {
		System.out.println("abcd");
	}


	public static void save2file(ClassVisitor cw, String path) {
		if (!(cw instanceof DebuggingClassWriter))
			return;

		try(FileOutputStream fos = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			bos.write(((DebuggingClassWriter) cw).toByteArray());
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
