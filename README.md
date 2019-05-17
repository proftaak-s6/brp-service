# BRP

Dit is een mock versie van het basisregister persoonsgegevens. Hier kun je via GrapQL een persoon opzoeken op ID of BSN. GrapQL is beschikbaar op `/graphql` en de graphiql playground is beschikbaar `/graphiql`.

## Voorbeelden

Javascript

```js
const query = 
    `query {
		person(id: 1) {
		bsn,
		gegeven_naam
		}
	}`;

const response = await fetch(`http://brp.fontys-project.nl/graphql?query=${query}`);
const json = await response.json();

if (json.errors) {
    console.log(json.errors)
} else {
    const person = json.data.person;
    console.log(person)
} 
```

Java

```java
String baseUrl = "http://brp.fontys-project.nl/graphql?query=";
String query = "query { person(id: 1) { bsn, gegeven_naam } }";

URL url = new URL(baseUrl + URLEncoder.encode(query, "UTF-8"));
HttpURLConnection request = (HttpURLConnection) url.openConnection();

InputStreamReader inputReader = new InputStreamReader(request.getInputStream());
BufferedReader reader = new BufferedReader(inputReader);

String inputLine;
StringBuffer response = new StringBuffer();

while ((inputLine = reader.readLine()) != null) {
	response.append(inputLine);
}

reader.close();

System.out.println(response);
// {"data":{"person":{"bsn":"067148256","gegeven_naam":"Iza"}}}
```



Je kan de volgende gegevens over een persoon opvragen:

```
id
geslacht
aanhef
gegeven_naam
initialen
achternaam
straat
woonplaats
provincie
postcode
land
emailadres
telefoonnummer
geboortedatum
bsn
voertuig
nameset
provincie_code
land_code
gebruikersnaam
wachtwoord
browser_agent
telefoon_land_code
meisjesnaam
sterrenbeeld
creditcard_type
creditcard_nummer
cvv2
creditcard_verloop
upstracking
western_union
money_gram
kleur
beroep
bedrijf
website
bloedtype
gewicht_lbs
gewicht_kgs
lengte_ft
lengte_cm
guid
breedtegraad
lengtegraad
leeftijd
```

