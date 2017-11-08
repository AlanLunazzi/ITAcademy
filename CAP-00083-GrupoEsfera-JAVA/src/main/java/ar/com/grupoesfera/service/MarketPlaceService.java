package ar.com.grupoesfera.service;

import java.util.ArrayList;

import ar.com.grupoesfera.model.User;
import ar.com.grupoesfera.model.Item;

public class MarketPlaceService {

	private ArrayList<Item> items = new ArrayList<Item>();

	public void publishItem(User user, String descripcion, double precio) {
		Item item = new Item(descripcion, precio, user);
		items.add(item);
	}

	public ArrayList<Item> getItems() {
		return items;
	}
}
