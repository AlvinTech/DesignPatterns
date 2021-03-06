package policy;

/**
 * Created by Alvin on 16/11/4.
 */

/*
需求如下：
某支付系统接入以下几种商户进行充值：易宝网易，快线网银，19pay手机支付，支付宝支付，骏网一卡通，
由于每家充值系统的结算比例不一样，而且 同一家商户的不同充值方式也有所不同，具体系统情况比较复杂，
像支付宝既有支付宝账号支付和支付宝网银支付等这些暂时不考虑，为了讲述策略模式这里简单描 述，
假如分为四种，手机支付，网银支付，商户账号支付和点卡支付。因为没个支付结算比例不同，所以对手续费
低的做一些优惠活动，尽可能让用户使用手续费低 的支付方式来充值，这样降低渠道费用，增加收入，具体优惠政策如下：
①网银充值，8.5折；
③手机充值，没有优惠；
④点卡充值，收取1%的渠道费；
 */
public class Client {
    public static void main(String[] args) {
        double price = 100;
        Context context = new Context(PayType.BANK);
        double result = context.calculatePrice(price);
        System.out.println(PayType.BANK +"  "+ result);

        context = new Context(PayType.CARD);
        result = context.calculatePrice(price);
        System.out.println(PayType.CARD +"  "+ result);

        context = new Context(PayType.MOBILE);
        result = context.calculatePrice(price);
        System.out.println(PayType.MOBILE +"  "+ result);
    }
}

