var questions = [
{
"id": 1,
"key": "What is the capital of Arunachal Pradesh?",
"option": ["Itanagar", "Dispur", "Imphal", "Shillong"],
"answer": "option[0]"
},
{
"id": 2,
"key": "Which state has the largest area?",
"option": ["Maharashtra", "Madhya Pradesh", "Uttar Pradesh", "Rajasthan"],
"answer": "option[3]"
},
{
"id": 3,
"key": "Which state has the largest population?",
"option": ["Uttar Pradesh", "Maharastra", "Andra Pradesh", "Bihar"],
"answer": "option[0]"
},
{
"id": 4,
"key": "What is the state flower of Haryana?",
"option": ["Lotus", "Rhododendron", "Golden Shower", "Not declared"],
"answer": "option[0]"
},
{
"id": 5,
"key": "Which state has Almond as its State Tree?",
"option": ["Himachal Pradesh", "Goa", "Jammu and Kashmir", "Arunachal Pradesh"],
"answer": "option[2]"
}
];
function startTest() {
mainWindow.innerHTML = "";
createView(questions[question]);
}