package lucaguerra;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Topping extends AbstractProdotti {

	private List<Topping> comboToppings;

	public Topping(String nome, double prezzo) {
		super(nome, prezzo);
		comboToppings = new ArrayList<>();
	}

	public void aggiungiCombinazioneTopping(Topping topping) {
		comboToppings.add(topping);
	}

}
