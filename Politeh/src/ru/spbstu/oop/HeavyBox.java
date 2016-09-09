package ru.spbstu.oop;



/**
 * Created by sergey.tovmasyan on 08/09/16.
 */
class HeavyBox extends Box {
    int weight;

    public HeavyBox() {
    }

    HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public static void main(String[] args) {
        HeavyBox box = new HeavyBox();
        System.out.println(box.getValue(0,1,2,3,4,5));


    }

    public Long getValue(int a, int... strings){
        for (int str : strings) {
            System.out.println(str);
        }
        return (a==1 && 1==1) ? new Long(1) : null;
    }






}
