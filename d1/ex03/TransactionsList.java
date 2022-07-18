package d1.ex03;

import java.util.UUID;

public interface TransactionsList {
    public void add_trans(Transaction transaction);
    public void delete_by_id(UUID id);
    public Transaction [] list_to_arr();

}
