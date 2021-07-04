package application;

import java.util.Locale;

import java.util.Scanner;

/**
 * Proposal: Building a management system will allow ad management and tracking
 * of campaign results .
 * 
 * Part 1: An online ad range calculator.
 * 
 * @author: Patricia N.Freitas
 *
 */

public class Calculator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		/* Enter with total investment value. */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter with total investment value: ");
		double investiment = sc.nextDouble();

		/* Considering the data reported, it calculates the share percentage. */

		double percentOfClicks = 12 / 100f;
		int ClickPerPerson = 20;
		int sharePerClick = 3;

		double sharePercentage = percentOfClicks / ClickPerPerson * sharePerClick;

		/* Calculates range price per person for every R$1.00 invested */
		double costBase = 1.00;
		int range = 30;

		double adCostPerPerson = costBase / range;

		/* Calculates original views and reach of shared views */

		double originalViews = investiment / adCostPerPerson;

		double shareForecast = originalViews * sharePercentage;

		int MaxSharing = 4;
		int newViews = 40;

		int rangeOfViews = (int) (shareForecast * MaxSharing * newViews);

		double MaxViews = originalViews + rangeOfViews;

		System.out.println("About " + MaxViews + " people will view the same ad.");

		sc.close();

	}

}
