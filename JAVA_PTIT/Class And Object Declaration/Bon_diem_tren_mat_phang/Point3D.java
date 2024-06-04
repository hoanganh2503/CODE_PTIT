package Bon_diem_tren_mat_phang;
public class Point3D {
    // private int x, y, z;

    // public Point3D(int x, int y, int z){
    //     this.x = x;
    //     this.y = y;
    //     this.z = z;
    // }

    // public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
    //     int arr1[] = {p2.x - p1.x, p2.y - p1.y, p2.z - p1.z};
    //     int arr2[] = {p3.x - p1.x, p3.y - p1.y, p3.z - p1.z};
    //     int arr3[] = {p4.x - p1.x, p4.y - p1.y, p4.z - p1.z};

    //     int[] a = {
    //         arr1[1] * arr2[2] - arr1[2] * arr2[1],
    //         arr1[2] * arr2[0] - arr1[0] * arr2[2],
    //         arr1[0] * arr2[1] - arr1[1] * arr2[0]
    //     };
    //     int check = a[0] * arr3[0] + a[1] * arr3[1] + a[2] * arr3[2];
    //     if(check == 0) return true;
    //     return false;
    // }
    private int x, y, z;

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
        int[] v1 = {p2.x - p1.x, p2.y - p1.y, p2.z - p1.z};
        int[] v2 = {p3.x - p1.x, p3.y - p1.y, p3.z - p1.z};
        int[] v3 = {p4.x - p1.x, p4.y - p1.y, p4.z - p1.z};

        int[] crossProduct = {
            v1[1] * v2[2] - v1[2] * v2[1],
            v1[2] * v2[0] - v1[0] * v2[2],
            v1[0] * v2[1] - v1[1] * v2[0]
        };
        int dotProduct = crossProduct[0] * v3[0] + crossProduct[1] * v3[1] + crossProduct[2] * v3[2];
        return dotProduct == 0;
    }
}
