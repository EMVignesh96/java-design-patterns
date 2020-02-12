package factorymethod;

public class PlanFactory {

    /**
     * The factory method that returns a Plan based on the planType
     */
    public static Plan getPlan(PlanType planType) {
        Plan plan = null;
        switch (planType) {
            case PLAN_TYPE_DOMESTIC:
                return new DomesticPlan();
            case PLAN_TYPE_INDUSTRIAL:
                return new IndustrialPlan();
            case PLAN_TYPE_COMMERCIAL:
                return new CommercialPlan();
        }
        return plan;
    }

    enum PlanType {
        PLAN_TYPE_DOMESTIC,
        PLAN_TYPE_INDUSTRIAL,
        PLAN_TYPE_COMMERCIAL
    }
}
