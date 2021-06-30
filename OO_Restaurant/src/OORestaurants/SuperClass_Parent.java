/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Adekar
 */
public class SuperClass_Parent {
    
    public double Filet_O_Fish;
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    public double ChickenLegend;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
     //=========================================================Price========================================================
    
    public double pFilet_O_Fish = 3.65*70;
    public double pChickenBurger = 2.95*70;
    public double pChickenBurgerM = 3.98*70;
    public double pBaconCheeseBurger = 2.65*70;
    public double pChickenLegend = 3.64*70;
    
    public double pMilkShake = 2*70;
    public double pVanillaCone = 2.20*70;
    public double pClasVanilla = 2.50*70;
    public double pVanMilkShake = 1.95*70;
    public double pChocMilkShake = 2.37*70;
    
    //=======================================================================================================================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
     
    //=======================================================================================================================
    
    public double GetAmount()
    {
        Meals = Filet_O_Fish + ChickenBurger + ChickenBurgerM + BaconCheeseBurger + ChickenLegend;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        
        TotalofMD = Meals + Drinks ;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant system",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    
   
    
    
}
 