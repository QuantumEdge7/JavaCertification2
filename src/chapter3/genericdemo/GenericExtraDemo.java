package chapter3.genericdemo;

import java.util.ArrayList;
import java.util.List;

public class GenericExtraDemo {
	
	public static void main(String[] args) {
		//1.Generic wild cards
		//There are generally two kinds of wild-cars in Generics.Bounded and
		//Unbounded.Bounded wildcards can be written in two ways to denote
		//upper bound and lower bound. <?> is called unbounded wildcars
		//because it can accept any Type while <? extends T> and <? super T>
		//are bounded wildcards
		
		
		//"?"
		//"?" denotes any unknown type, It can represent any type in code.
		//Use this wild card if we are not sure about type.
		//for eaxample if we want to have a ArrayList which can work with any type then
		//we can decalre it as ArrayList<?> unknownList" and it can be assigned to
		//any type of ArrayList 

		ArrayList<?> unknownList = new ArrayList<>();
		
		
		ArrayList<? extends Number> numberList = new ArrayList<>();
		
		ArrayList<? super Number> nList = new ArrayList<>();
	}

}
