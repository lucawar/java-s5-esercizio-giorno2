package lucaguerra;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Pizza extends AbstractProdotti {

	private List<Topping> toppings = new ArrayList<>();
	private String valoreNutrizionale;
	private Topping topping;

	public Pizza(String nome, double prezzo, String valoreNutrizionale, Topping topping) {
		super(nome, prezzo);
		this.valoreNutrizionale = valoreNutrizionale;
		this.topping = topping;
	}

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	@Override
	public String toString() {
		return " " + getNome() + " " + getPrezzo() + " " + topping + getToppings() + valoreNutrizionale;
	}
}
