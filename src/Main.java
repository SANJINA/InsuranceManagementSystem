import com.insurance.main.PolicyManagementModule;
import com.insurance.model.Policy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Insurance Management System");

        //user input here
        //Map<Integer, Policy> policyMap = new HashMap<>();
        //policyMap.put(101, new Policy(101,"1011","Health Insurance",50000.0,50.0,"2022-10-10","2023-10-10","2023-10-01","Active",true));

        //create customer
        PolicyManagementModule pmm = new PolicyManagementModule();
        pmm.displayPolicyMenu();

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch(input){
            case 1:
                pmm.CreatePolicy();
                break;
            case 2:
                //pmm.UpdatePolicy();
                System.out.println("Update operation");
                break;
            case 3:
                //pmm.DeletePolicy();
                System.out.println("Delete operation");
                break;
            case 4:
                //pmm.SearchPolicy();
                System.out.println("Search operation");
                break;
            default:
                System.out.println("Invalid number! Please enter a number from 1-4.");
        }

        System.out.println("List of all policies ids created: ");
        //Deepak:why is it always showing only one id
        Map<String, Policy> p = pmm.displayData();
        for(Policy value : p.values()){
            System.out.println(value.getPolicyId());
        }
    }
}