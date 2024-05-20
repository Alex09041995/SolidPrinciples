package Shop;

import java.math.BigDecimal;

public class Shop {
    
    private Payment payment; /** интерфейс - Payment */

    public Shop (Payment payment) { /** конструктор для передачи в него нужного типа оплаты */
        this.payment = payment;

    }

    public void doPayment (Object order, BigDecimal amount) { /** метод "doPayment" меняем на интерфейс "payment" для отсутствия привязки к одному типу оплаты, и чтобы можно было реализовывать два разных типа оплаты  */
        payment.doTransaction(amount); 
    }
}
