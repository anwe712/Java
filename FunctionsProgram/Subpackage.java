package FunctionsProgram;

import PackagePrograms.CreatePackage;

//here we are importing from "packageprograms"  package , the class - "createpackage" so that we can use the sum fucntion defined there 
public class Subpackage {
    public int minus(int c, int d) {
        int sub = 0;
        sub = c - d;
        return sub;
    }

    public void main(String[] args) {
        CreatePackage obj = new CreatePackage();
        System.out.println("The summation is imported from another package and is " + (obj.sum(90, 78)));
        System.out.println("The minus = " + minus(90, 70));

    }
}
