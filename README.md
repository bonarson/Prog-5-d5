# Machine à Café Automatique

## Description

Ce projet simule une machine à café autonome. L'utilisateur peut commander un café, effectuer un paiement simulé et recevoir un message de confirmation comme s’il recevait réellement son café.

L'objectif est également pédagogique : apprendre à organiser une logique claire, gérer les erreurs et structurer le code avec des classes.

---

## Fonctionnement général

L'application suit ces étapes :

- Pay : L'utilisateur insère de l'argent (simulation).
- Get Coffee : Il choisit un type de café.
- UseClass : Les actions sont gérées par des classes dédiées.
- Errors : Les erreurs (paiement insuffisant, stock manquant, etc.) sont gérées proprement.

---

## Structure simplifiée

- Model : Contient les données simulées (types de café, stock...).
- Service : Gère la logique métier (paiement, sélection, validation...).

---

## Entités principales

- MachineACafé : Gère la préparation et le stock.
- Client : L'utilisateur qui passe commande.
- Café : Le produit final (expresso, latte, VIP...).
- Stock : Suivi des ingrédients (café, lait, sucre...).
- Monnayeur : Gère les paiements et rend la monnaie.

---

## Types de cafés proposés

1. Café Simple : Café noir avec ou sans sucre.  
2. Café au Lait : Café + lait avec ou sans sucre.  
3. Café VIP : Café spécial avec mousse de lait et sucre vanillé.

---

## Éléments nécessaires

- Café (grains ou poudre)  
- Sucre  
- Cuillère  
- Lait  
- Tasse  
- Monnayeur (simulateur de paiement)

---

## Cas d’utilisation

1. Commander un café :  
   - Choisir un café  
   - Vérification du stock  
   - Préparation et service du café  

2. Insérer de l'argent :  
   - Saisie du montant  
   - Validation du paiement  

3. Gérer le stock :  
   - Alerte si un ingrédient est insuffisant  

4. Rendre la monnaie :  
   - Si le paiement est trop élevé ou annulé  

---

## Erreurs possibles

- Paiement insuffisant → "Veuillez insérer plus d'argent."  
- Stock épuisé → "Ingrédient manquant. Choix indisponible."  
- Tasse manquante → "Aucune tasse disponible."  
- Erreur monnayeur → "Erreur de paiement. Contactez le support."  

---

## Exemple de fonctionnement (Interface CLI simulée)

```
===============================
   BIENVENUE DANS COFFEEBOT
===============================

Veuillez insérer votre argent : 2€

Choisissez votre café :
1. Café Simple (1.50€)
2. Café au Lait (1.80€)
3. Café VIP (2.00€)

> Votre choix : 2

[Monnayeur] Paiement accepté (2.00€)
[MachineACafé] Vérification du stock...
 - Café : OK
 - Lait : OK
 - Sucre : OK
 - Tasse : OK

[Préparation en cours...]
 - Chauffage de l'eau...
 - Ajout du café...
 - Ajout du lait...
 - Mélange...
 - Service dans la tasse...

Votre Café au Lait est prêt. Bonne dégustation !

[Monnayeur] Rendu de la monnaie : 0.20€
```

---

## Exemple d'erreur (stock insuffisant)

```
===============================
   BIENVENUE DANS COFFEEBOT
===============================

Veuillez insérer votre argent : 2€

Choisissez votre café :
1. Café Simple (1.50€)
2. Café au Lait (1.80€)
3. Café VIP (2.00€)

> Votre choix : 3

[Monnayeur] Paiement accepté (2.00€)
[MachineACafé] Vérification du stock...
 - Café : OK
 - Lait : ÉPUISÉ

[Erreur] Ingrédient manquant : lait
Impossible de préparer le Café VIP.

[Monnayeur] Rendu de la monnaie : 2.00€
```

---

## Objectif pédagogique

Ce projet montre comment :

- Organiser une logique métier claire
- Gérer les erreurs utilisateur
- Utiliser des classes pour structurer proprement le code

https://github.com/Ramananolo/Coffee-Machine-Project/blob/main/README.md
