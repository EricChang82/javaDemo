package cn.java.collectionTest.listTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.java.Util;

public class ArrayListTest{
 public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
     list.add("Hello");
     list.add("World");
     list.add("HAHAHAHA");
     //第一种遍历方法使用foreach遍历List
     for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
        Util.print(str);
     }
 
     //第二种遍历，把链表变为数组相关的内容进行遍历
     String[] strArray=new String[list.size()];
     list.toArray(strArray);
     for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray)这种形式
     {
        Util.print(strArray[i]);
     }
     //  for(String str:strArray)这种形式
     for (String str : strArray) {           
         Util.print(str);
      }
     
    //第三种遍历 使用迭代器进行相关遍历.该方法可以不用担心在遍历的过程中会超出集合的长度
     
     Iterator<String> ite=list.iterator();
     while(ite.hasNext())//判断下一个元素之后有值
     {
         Util.print(ite.next());
     }
 }
}