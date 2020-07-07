package com.saini.ocp;

/*Open to support more types of insurance claims.
Closed for any modifications whenever support for a new type of claim is added.*/

public class ClaimApprovalManager {

    /*public void processHealthClaim(HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }*/ // Bad Design

    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
