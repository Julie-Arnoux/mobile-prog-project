# NotPokemonGo

-Ce projet est une application mobile simple développée en kotlin faisant appel à l'API Rest PokeApi disponible ici: https://pokeapi.co/docs/v2.
Elle affiche une liste de pokémons grâce à une RecyclerView sur un premier fragment et permet de consulter les détails des pokémons une fois sélectionnés sur un second.

Toutes les données récupérées via les appels API sont stockées en cache. L'application utilise un singleton pour les appels API et le stockage en cache.
L'application suit une architecture MVVM simple et toutes les images sont chargées via leur url avec Picasso.

Voici ci-après quelques screenshots de l'application: https://prnt.sc/1434y3t (Liste des pokémons avec leur nom et sprite), https://prnt.sc/1435k9h (détail d'un pokémon avec son nom et sprite)

-PERSPECTIVES:
  * Amélioration du design de l'application
  * Ajout de plusieurs charactéritiques sur l'écran de détail
  * Notifications PUSH lorsque de nouveaux pokémons sont disponibles, lorsque le joueur ne s'est pas connecté sur l'application depuis longtemps

