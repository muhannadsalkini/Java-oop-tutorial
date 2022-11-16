/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationships;

/**
 *
 * @author mohan
 */
public class Department {
    private int deptNo;
    private String deptName;

    public Department() {
    }

    public Department(int deptNo, String deptName) {
        setDeptNo(deptNo);
        setDeptName(deptName);
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" + "deptNo=" + deptNo + ", deptName=" + deptName + '}';
    }
    
    
}
