package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 双层键值数据结构
 * Double KeyValue
 * Fc_404@20201012
 * 此数据结构非常适用ini配置文件的存储
 */
public class twoArray {
    List<String> root = new ArrayList<String>();
    List<String> root2 = new ArrayList<String>();
    List<String> group = new ArrayList<String>();
    List<List> l = new ArrayList<List>();

    //设置根键值
    public void setKeyValue(String key, String value){
        int indexRoot = root.indexOf(key);
        if (indexRoot == -1){
            root.add(key);
            root2.add(value);
        } else {
            root2.set(indexRoot, value);
        }

    }
    //设置带组键值
    public void setKeyValue(String key, String value, String groupN){
        int indexGroup = group.indexOf(groupN);
        if (indexGroup == -1) {
            group.add(groupN);
            l.add(new ArrayList<String>());
            l.add(new ArrayList<String>());
        }
        indexGroup = group.indexOf(groupN);
        int indexRoot = l.get(indexGroup * 2).indexOf(key);
        if (indexRoot == -1){
            l.get(indexGroup * 2).add(key);
            l.get(indexGroup * 2 + 1).add(value);
        }else {
            l.get(indexGroup * 2 + 1).set(indexRoot, value);
        }
    }

    //获取根键值
    public String getKeyValue(String key){
        int indexRoot = root.indexOf(key);
        if (indexRoot == -1)
            return null;
        return root2.get(indexRoot);
    }
    //获取带组键值
    public String getKeyValue(String key, String group){
        int indexGroup = this.group.indexOf(group);
        if (indexGroup == -1)
            return null;
        int indexRoot = l.get(indexGroup * 2).indexOf(key);
        if (indexRoot == -1)
            return null;
        return (String)l.get(indexGroup * 2 + 1).get(indexRoot);
    }
}
