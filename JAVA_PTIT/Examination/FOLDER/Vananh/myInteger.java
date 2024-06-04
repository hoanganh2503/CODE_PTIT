package Examination.FOLDER.Vananh;

public class myInteger {
    public int sum, min_position;

    public myInteger(String str) {
        String temp[] = str.split(" ");
        int temp_arr[] = new int[temp.length];
        int temp_sum = 0;
        int temp_min = 0;
        for (int i = 0; i < temp.length; i++) {
            temp_arr[i] = Integer.parseInt(temp[i]);
            temp_sum += temp_arr[i];
            if(temp_arr[i] < temp_arr[temp_min]){
                temp_min = i;
            }
        }
        this.sum = temp_sum;
        this.min_position = temp_min;
    }

    public int getSum(){
        return this.sum;
    }

    public int getMinPosition(){
        return this.min_position + 1;
    }

}
