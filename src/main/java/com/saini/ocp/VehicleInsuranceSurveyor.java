package com.saini.ocp;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        return true;
    }

}
