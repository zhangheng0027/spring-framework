package org.springframework.zh;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public void aa(String str) {
		System.out.println(str);
	}

	public void aa(Object o) {
		System.out.println(o);
	}

	public boolean bb(int i) {
		return i > 0;
	}

	public void cc(int i) {
		if (bb(i)) {
			aa("i > 0");
		}
	}

	public void dd(int i) {
		if (bb(i)) {
			aa("i > 0");
		} else {
			aa("i <= 0");
		}
	}

	public void ee(int c) {
		for (int i = 0; i < c; i++) {
			aa(i);
		}
	}

	public void ff(int c) {
		while (c-- > 0) {
			aa(c);
		}
	}

	public void gg(int c) {
		do {
			aa(c);
		} while (--c > 0);
	}

	public Set<Object> hh(String s) {
		Set<Object> set = new HashSet<>(64);
		set.add(s);
		return set;
	}

	public void ii() {
		Set<Object> set = hh("abcd");
		Iterator<Object> it = set.iterator();
		while (it.hasNext()) {
			aa(it.next());
		}
	}

	public void jj() {
		Set<Object> set = hh("abcd");
		for (Object o : set) {
			aa((String)o);
		}
	}

	public void kk() throws IOException {

	}

	public void ll() throws ClassNotFoundException {

	}

	public void mm() {
		try {
			kk();
		} catch (IOException e) {
			aa(e);
		}
	}

	public void nn() {
		try {
			kk();
		} catch (IOException e) {
			aa(e);
		} finally {
			aa("this is finally");
		}
	}

	public void oo() {
		try {
			kk();
			ll();
		} catch (IOException e) {
			aa(e);
		} catch (ClassNotFoundException e) {
			aa(e);
		}
	}

	public void pp() {
		try {
			kk();
			ll();
		} catch (Exception e) {
			aa(e);
		}

	}

	public void qq() {
		try {
			kk();
			ll();
		} catch (IOException | ClassNotFoundException e) {
			aa(e);
		}
	}

	public void rr(String str) {
		switch (str) {
			case "a":
				aa(str);
				break;
			case "b":
				mm();
			case "c":
				nn();
				break;
			default:
				aa("this is default");
				break;
		}
	}


}
