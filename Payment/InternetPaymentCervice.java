package Payment;

public class InternetPaymentCervice implements PhonePayment, CardPayment { /** Класс иимплементрируемый от классов: PhonePayment, CardPayment */
    
    @Override
    public void payCreditCard() { /** метод реализации для оплаты по карте  */
      
    }

    @Override
    public void payPhoneNumber() { /** метод реализации для оплаты по номеру телефона  */
       
    }
}
