package factionmod.event;

import java.util.ArrayList;

import net.minecraftforge.fml.common.eventhandler.Event;
import factionmod.faction.Faction;

/**
 * This event is fired when a player request the informations of faction. You
 * can customize the displayed informations.
 * 
 * @author BrokenSwing
 *
 */
public class FactionInfoEvent extends Event {

	private final Faction		faction;
	private ArrayList<String>	informations;

	public FactionInfoEvent(Faction faction, ArrayList<String> informations) {
		this.faction = faction;
		this.informations = informations;
	}

	/**
	 * Returns a list containing the lines which will be displayed to the
	 * player.
	 * 
	 * @return a list of String
	 */
	public ArrayList<String> getInformations() {
		return informations;
	}

	/**
	 * Changes the informations which will be displayed to the player.
	 * 
	 * @param informations
	 *            The new informations
	 */
	public void setInformations(ArrayList<String> informations) {
		this.informations = informations;
	}

	/**
	 * The faction which is concerned by the informations.
	 * 
	 * @return the faction
	 */
	public Faction getFaction() {
		return faction;
	}

}
