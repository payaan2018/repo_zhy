package com.zhy;

public class TestMemory {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();//����Java �������ͼʹ�õ�����ڴ�����
        long totalMemory = Runtime.getRuntime().totalMemory();//����Java ������е��ڴ�������
        System.out.println("MAX_MEMORY = " + maxMemory + "���ֽڣ���" + (maxMemory / (double) 1024 / 1024) + "MB");
        System.out.println("TOTAL_MEMORY = " + totalMemory + "���ֽڣ���" + (totalMemory / (double) 1024 / 1024) + "MB");
    }
}
