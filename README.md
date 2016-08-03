#physicalc

A Rest physical calculator.

Calculate the mass-energy equivalence, the famous Einstein equation:

E=mc²

Clone this repository, compile the project and enjoy it! 

Request the Rest service, passing a mass: 

<code>
http://localhost:8080/physicalc/einsten/10
</code>

The expected return will be the corresponding energy in JSON format: 

<code>
{"equation":"e=mc2","mass":10.0,"energy":8.9875517873681766E17}
</code>