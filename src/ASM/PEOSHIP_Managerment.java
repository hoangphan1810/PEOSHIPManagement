/**
	File name: IST261_project
	Short description: PEOSHIP_Management class
	IST 261 Assignment: PEOSHIP MANAGERMENT
	@author Hoang Phan
	Oct 1st, 2020
*/
package ASM;

import java.io.Serializable;

/**
 *
 * @author Hoang Phan
 */
public class PEOSHIP_Managerment implements Serializable{
    
    private String UID,Program,Description;
    private int CODE;
    private double Amount_Provided;

    public PEOSHIP_Managerment() {
       this.UID = "";
        this.Program = "";
        this.Description = "";
        this.CODE = 224;
        this.Amount_Provided = 1000000;
    }

    public PEOSHIP_Managerment(String UID, String Program, String Description, int CODE, double Amount_Provided) {
        this.UID = UID;
        this.Program = Program;
        this.Description = Description;
        this.CODE = CODE;
        this.Amount_Provided = Amount_Provided;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getCODE() {
        return CODE;
    }

    public void setCODE(int CODE) {
        this.CODE = CODE;
    }

    public double getAmount_Provided() {
        return Amount_Provided;
    }

    public void setAmount_Provided(double Amount_Provided) {
        this.Amount_Provided = Amount_Provided;
    }

    @Override
    public String toString() {
       return this.UID + "\t" + this.Program + "\t" + this.CODE + "\t" + this.Description + "\t" + this.Amount_Provided;
    }
    

}
