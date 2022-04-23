package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));

    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if (width<=0||height<=0||areaPerBucket<=0||extraBuckets<=0){
            System.out.println("Invalid Value");
            return -1;
        }
            double wallArea=width*height;
            double remainingArea=wallArea-(areaPerBucket*extraBuckets);
            int reqiuredBuckets=(int)(Math.ceil(remainingArea/areaPerBucket));

        return reqiuredBuckets;

    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if (width<=0||height<=0||areaPerBucket<=0){
            System.out.println("Invalid Value");
            return -1;
        }
        double wallArea=width*height;
        int reqiuredBuckets=(int)(Math.ceil(wallArea/areaPerBucket));
        return reqiuredBuckets;

    }
    public static int getBucketCount(double area,double areaPerBucket){
        if (area<=0||areaPerBucket<=0){
            System.out.println("Invalid Value");
            return -1;
        }

        int reqiuredBuckets=(int)(Math.ceil(area/areaPerBucket));
        return reqiuredBuckets;

    }
    public static boolean isNotValid(double x){
        return x<0;
    }
}
