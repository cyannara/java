package com.yedam.app;

import java.util.Arrays;
import java.util.List;
/*
stream map과 sum을 이용해서 합계 계산
*/
public class StreamMapTest {
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("abc","aa","bbbb","cccc");
		int a = str.stream().mapToInt(ele ->  str.size() ).sum();
		System.out.println(a);
		
	}
}
