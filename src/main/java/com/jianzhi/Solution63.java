package com.jianzhi;

//题目描述
//如何得到一个数据流中的中位数？
//如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
//如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
//我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。

//其实方法很多啊。简单介绍几个思路
//方法1：使用无序数组存储，然后需要对数组进行排序，然后就可以顺利找到中位数。
//方法2：在插入数组时，就进行排序，形成有序的数组，排完序后就可以直接找到中位数
//方法3：使用树结构，二叉搜索树或者平衡二叉树，都是在插入的时候完成排序。
//方法4：大家答案中出现最多的方法，利用两个堆。

import java.util.ArrayList;
import java.util.Collections;

public class Solution63 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public void Insert(Integer num) {
        arrayList.add(num);
    }

    public Double GetMedian() {
        Collections.sort(arrayList);
        int index = arrayList.size()/2;
        if (arrayList.size()%2 !=0){
            return (double) arrayList.get(arrayList.size()/2);
        }else{
            return ((double)(arrayList.get(index-1))+(double)arrayList.get(index))/2;
        }
    }

}
