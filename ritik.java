let board = [
  [5,3,"","",7,"","","",""],
  [6,"","",1,9,5,"","",""],
  ["",9,8,"","","","",6,""],
  [8,"","","",6,"","","",3],
  [4,"","",8,"",3,"","",1],
  [7,"","","",2,"","","",6],
  ["",6,"","","","",2,8,""],
  ["","","",4,1,9,"","",5],
  ["","","","","8","","",7,9]
];

function createBoard() {
    let boardDiv = document.getElementById("board");
    boardDiv.innerHTML = "";

    for (let r = 0; r < 9; r++) {
        for (let c = 0; c < 9; c++) {
            let input = document.createElement("input");
            input.classList.add("cell");

            if (board[r][c] !== "") {
                input.value = board[r][c];
                input.disabled = true;
            }

            boardDiv.appendChild(input);
        }
    }
}

function checkSolution() {
    alert("Checking solution (basic demo)");
}

createBoard();