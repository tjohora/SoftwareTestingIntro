/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingca;

public class SoftwareTestingCA {
    
    // Method to cover part 1 of the CA question
    public boolean approvalCheck (int amount, int value, int salary, boolean investment, int deposit) 
    {
        boolean approval = false;
        
        if (amount <= (value * 0.8))
        {
            if (amount <= (salary * 2.5))
            {
                if (!investment)
                {
                    if (deposit > 4999)
                        approval = true;
                }
            }          
        }    
        return approval;
    }
    
    // Method to cover part 2 of the CA question
    public String approvalCheck1 (int amount, int value, int salary, boolean investment, int deposit) 
    {
        String approval = "Don't approve";
        
        if (amount <= (value * 0.8))
        {
            if (amount <= (salary * 2.5))
            {
                if (!investment)
                {
                    if (deposit > 4999)
                        approval = "Approve";
                }
            }            
        }    
        
        if (deposit > 20000)
            approval = "Approve with 2% discount";
        
        return approval;   
    }
    
}