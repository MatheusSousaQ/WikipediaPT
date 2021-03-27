$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "#Funcionalidade: Consulta"
    },
    {
      "line": 4,
      "value": "#Cenario: Consultar Ovo de Pascoa"
    },
    {
      "line": 5,
      "value": "#Dado que acesso a Wikipedia em portugues"
    },
    {
      "line": 6,
      "value": "#Quando pesquiso por \"Ovo de Páscoa\""
    },
    {
      "line": 7,
      "value": "#Entao Exibe a expressao \"Ovo de Páscoa\" no titulo da guia"
    }
  ],
  "line": 11,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3103323912,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta;consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "que acesso a Wikipedia em portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "pesquiso por \"Ovo de Páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Exibe a expressao \"Ovo de Páscoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.que_acesso_a_Wikipedia_em_portugues()"
});
formatter.result({
  "duration": 2212631373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquiso_por(String)"
});
formatter.result({
  "duration": 1619563381,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibe_a_expressao_no_titulo_da_guia(String)"
});
formatter.result({
  "duration": 522530396,
  "status": "passed"
});
formatter.after({
  "duration": 2746641203,
  "status": "passed"
});
});