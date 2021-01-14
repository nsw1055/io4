package io4;

import java.util.ArrayList;
import java.util.List;

import org.keroro.store.Menu;

public class MenuTest {

	public static void main(String[] args)throws Exception {
		
		List<Menu> menuList = new ArrayList<>();
		menuList.add(new Menu("빅맥",1));
		menuList.add(new Menu("불고기버거",2));
		menuList.add(new Menu("1955버거",3));
		menuList.add(new Menu("상하이버거",4));
		menuList.add(new Menu("아메리카노",5));
		menuList.add(new Menu("콜라",6));
		menuList.add(new Menu("사이다",7));
		menuList.add(new Menu("감자튀김",8));
		menuList.add(new Menu("치킨너겟",9));
		menuList.add(new Menu("아이스크림",10));
		
		
	}
}
