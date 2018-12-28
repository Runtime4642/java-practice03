package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
	Goods[] goods=new Goods[COUNT_GOODS];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<COUNT_GOODS;i++)
		{
			goods[i] = new Goods();
		String name = sc.next();
		int price = sc.nextInt();
		int cnt = sc.nextInt();
		goods[i].setName(name);
		goods[i].setPrice(price);
		goods[i].setCountStock(cnt);
		}
		for(int i=0;i<COUNT_GOODS;i++)
			System.out.println(goods[i].getName()+"(가격:"+goods[i].getPrice()+"원)이 "+
					goods[i].getCountStock()+"개 입고 되었습니다.");
	}
	}

