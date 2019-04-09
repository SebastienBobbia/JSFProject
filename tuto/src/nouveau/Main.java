package nouveau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		ConsultantService consServ = new ConsultantService();
		FormationService formServ = new FormationService();
		ApprenantService appServ = new ApprenantService();
		ConnectionaSQL c = new ConnectionaSQL();

		
		c.connecter();		//Connection à la DB
		
		boolean repeter_SERVICE = true;
		while (repeter_SERVICE == true) {
		System.out.println("Bienvenue dans la gestion de services, quel service souhaitez vous gérer ?\n");

			boolean repeter_question1SERVICE=false;
			do {

				boolean fail;
				int choix_SERVICE = 0;
				do {
					try {
						
						System.out.println(
								"1 : Gestion des apprenants\n2 : Gestion des consultants\n3 : Gestion des formations\n4 : Quitter");

						Scanner scan1 = new Scanner(System.in);
						choix_SERVICE = scan1.nextInt();
						fail = false;
					} catch (InputMismatchException e1) {
						System.out.println(
								"Vous n'avez pas rentré un nombre entier en 1 et 4 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
						fail = true;
					}
				} while (fail == true);

				
				
				switch (choix_SERVICE) {

				case 1:
					System.out.println("Apprenant Service");
					repeter_question1SERVICE = false;

					boolean repeter_CRUD = true;
					while (repeter_CRUD == true) {
						System.out.println("Bienvenue dans le CRUD, quel operation souhaitez vous faire ?\n");

						boolean repeter_question1CRUD;
						do {

							// boolean fail;
							int choix_CRUD = 0;
							do {
								try {
									System.out.println(
											"Appuie sur 1 pour ajouter\n 2 pour rechercher \n 3 pour consulter toute la liste \n 4 pour supprimer\n");

									Scanner scan0 = new Scanner(System.in);
									choix_CRUD = scan0.nextInt();

									fail = false;
								} catch (InputMismatchException e1) {
									System.out.println(
											"Vous n'avez pas rentré un nombre entier en 1 et 3 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
									fail = true;
								}
							} while (fail == true);

							switch (choix_CRUD) {

							case 1:
								System.out.println("Vous allez ajouter");
								repeter_question1CRUD = false;
								appServ.ajouter();
								break;

							case 2:
								System.out.println("Rechercher");
								repeter_question1CRUD = false;

								appServ.rechercher();
								break;

							case 3:
								System.out.println("Consulter la liste\n");
								repeter_question1CRUD = false;

								appServ.consulter();

								break;

							case 4:
								System.out.println("vous etes dans l'option pour supprimer !");
								repeter_question1CRUD = false;
								appServ.supprimer();
								break;

							default:
								System.out.println("Choix non reconnu, recommencez !");
								repeter_question1CRUD = true;
							}

						} while (repeter_question1CRUD == true);

						boolean repeter_question2CRUD;
						do {

							// boolean fail;
							int reponse = 0;
							do {
								try {
									System.out.println(
											"Voulez-vous effectuer une nouvelle operation du CRUD sur ce meme service ? (Appuyez sur '1' pour oui ou '2' pour non)");
									Scanner scan2 = new Scanner(System.in);
									reponse = scan2.nextInt();

									fail = false;
								} catch (InputMismatchException e1) {
									System.out.println(
											"Vous n'avez pas rentré un nombre entier entre 1 et 4 comme je te l'ai demandé ... reessaye ce n'est pourtant pas compliqué !");
									fail = true;
								}
							} while (fail == true);

							if (reponse == 1) {
								repeter_CRUD = true;
								repeter_question2CRUD = false;
							} else if (reponse == 2) {
								repeter_CRUD = false;
								repeter_question2CRUD = false;
							} else {
								System.out.println("Réponse incorrecte, recommencez. " + reponse);
								repeter_question2CRUD = true;
							}

						} while (repeter_question2CRUD == true);

					}

					break;

				case 2:
					System.out.println("ConsultantService");
					repeter_question1SERVICE = false;

					repeter_CRUD = true;
					while (repeter_CRUD == true) {
						System.out.println("Bienvenue dans le CRUD, quel operation souhaitez vous faire ?\n");

						boolean repeter_question1CRUD;
						do {

							// boolean fail;
							int choix_CRUD = 0;
							do {
								try {
									System.out.println(
											"press 1 pour ajouter\n 2 pour rechercher \n 3 pour consulter toute la liste \n 4 pour supprimer\n");

									Scanner scan0 = new Scanner(System.in);
									choix_CRUD = scan0.nextInt();

									fail = false;
								} catch (InputMismatchException e1) {
									System.out.println(
											"Vous n'avez pas rentré un nombre entier en 1 et 3 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
									fail = true;
								}
							} while (fail == true);

							switch (choix_CRUD) {

							case 1:
								System.out.println("Vous allez ajouter");
								repeter_question1CRUD = false;
								consServ.ajouter();
								break;

							case 2:
								System.out.println("Vous allez rechercher");
								repeter_question1CRUD = false;

								consServ.rechercher();
								break;

							case 3:
								System.out.println("Consulter la liste\n");
								repeter_question1CRUD = false;

								consServ.consulter();

								break;

							case 4:
								System.out.println("Vous etes dans l'option pour supprimer !");
								repeter_question1CRUD = false;
								consServ.supprimer();
								break;

							default:
								System.out.println("Choix non reconnu, recommencez !");
								repeter_question1CRUD = true;
							}

						} while (repeter_question1CRUD == true);

						boolean repeter_question2CRUD;
						do {

							// boolean fail;
							int reponse = 0;
							do {
								try {
									System.out.println(
											"Voulez-vous effectuer une nouvelle operation du CRUD sur ce meme service ? (Appuyez '1' pour oui ou '2' pour non)");
									Scanner scan2 = new Scanner(System.in);
									reponse = scan2.nextInt();

									fail = false;
								} catch (InputMismatchException e1) {
									System.out.println(
											"Vous n'avez pas rentré un nombre entier entre 1 et 4 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
									fail = true;
								}
							} while (fail == true);

							if (reponse == 1) {
								repeter_CRUD = true;
								repeter_question2CRUD = false;
							} else if (reponse == 2) {
								repeter_CRUD = false;
								repeter_question2CRUD = false;
							} else {
								System.out.println("Réponse incorrecte, recommencez " + reponse);
								repeter_question2CRUD = true;
							}

						} while (repeter_question2CRUD == true);

					}

					break;

				case 3:
					System.out.println("FormationService");
					repeter_question1SERVICE = false;

					repeter_CRUD = true;
					while (repeter_CRUD == true) {
						System.out.println("Bienvenue dans le CRUD, quel operation souhaitez vous faire ?\n");

						boolean repeter_question1CRUD;
						do {

							// boolean fail;
							int choix_CRUD = 0;
							do {
								try {
									System.out.println(
											"Appuyez sur 1 pour ajouter\n2 pour rechercher \n3 pour consulter toute la liste \n4 pour supprimer\n");

									Scanner scan0 = new Scanner(System.in);
									choix_CRUD = scan0.nextInt();

									fail = false;
								} catch (InputMismatchException e1) {
									System.out.println(
											"Vous n'avez pas rentré un nombre entier en 1 et 3 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
									fail = true;
								}
							} while (fail == true);

							switch (choix_CRUD) {

							case 1:
								System.out.println("Vous allez ajouter");
								repeter_question1CRUD = false;
								formServ.ajouter();
								break;

							case 2:
								System.out.println("Vous aller rechercher");
								repeter_question1CRUD = false;

								formServ.rechercher();
								break;

							case 3:
								System.out.println("Consulter la liste\n");
								repeter_question1CRUD = false;

								formServ.consulter();

								break;

							case 4:
								System.out.println("Vous etes dans l'option pour supprimer !");
								repeter_question1CRUD = false;
								formServ.supprimer();
								break;

							default:
								System.out.println("Choix non reconnu, recommencez !");
								repeter_question1CRUD = true;
							}

						} while (repeter_question1CRUD == true);

						boolean repeter_question2CRUD;
						do {

							// boolean fail;
							int reponse = 0;
							do {
								try {
									System.out.println(
											"Voulez-vous effectuer une nouvelle operation du CRUD sur ce meme service ? (Appuyez '1' pour oui ou '2' pour non)");
									Scanner scan2 = new Scanner(System.in);
									reponse = scan2.nextInt();

									fail = false;
								} catch (InputMismatchException e1) {
									System.out.println(
											"Vous n'avez pas rentré un nombre entier entre 1 et 4 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
									fail = true;
								}
							} while (fail == true);

							if (reponse == 1) {
								repeter_CRUD = true;
								repeter_question2CRUD = false;
							} else if (reponse == 2) {
								repeter_CRUD = false;
								repeter_question2CRUD = false;
							} else {
								System.out.println("Réponse incorrecte, recommencez " + reponse);
								repeter_question2CRUD = true;
							}

						} while (repeter_question2CRUD == true);

					}

					break;
					
				case 4 : {
				}
				return;
				
				default:
					System.out.println("Choix non reconnu, recommencez !");
					repeter_question1SERVICE = true;

				} // fin switch services

			} while (repeter_question1SERVICE == true);// fin question1 services

			c.deconnecter();						//Deconnexion de la DB
			// boolean repeter_question2SERVICE;
			repeter_SERVICE = q2services(repeter_SERVICE);

		} // fin while repeter service

	} // fin public static void main

	// Main q2services = new Main();

	public static boolean q2services(boolean repeter_SERVICE) {
		boolean repeter_question2SERVICE;
		do // question2 services
		{

			boolean fail;
			int reponse = 0;
			do {
				try {
					System.out.println("Voulez-vous un nouveau service? (Appuyez '1' pour oui ou '2' pour non)");

					Scanner scan2 = new Scanner(System.in);
					reponse = scan2.nextInt();
					fail = false;
				} catch (InputMismatchException e1) {
					System.out.println(
							"Vous n'avez pas rentré un nombre entier en 1 et 4 comme je te l'ai demandé ... reessayez ce n'est pourtant pas compliqué !");
					fail = true;
				}
			} while (fail == true);

			if (reponse == 1) {
				repeter_SERVICE = true;
				repeter_question2SERVICE = false;
			} else if (reponse == 2) {
				repeter_SERVICE = false;
				repeter_question2SERVICE = false;
			} else {
				System.out.println("Réponse incorrecte, recommencez " + reponse);
				repeter_question2SERVICE = true;
			}
		} while (repeter_question2SERVICE == true);

		return repeter_SERVICE;
	}

} // fin public class Main
