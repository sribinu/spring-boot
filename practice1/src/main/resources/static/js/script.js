function showDetails() {
    fetch("http://localhost:8080/getAll")
      .then((response) => response.json())
      .then((data) => {
        const dataTable = document.getElementById("enrolledTable");
  
        // // Clear existing table rows (except header)
        // dataTable.innerHTML = `<tr>
        //     <th>ID</th>
        //     <th>Name</th>
        //     <th>Year</th>
        // </tr>`;
  
        // Append new rows
        data.forEach((data1) => {
          let row = `<tr>
              <td>${data1.id}</td>
              <td>${data1.name}</td>
              <td>${data1.year}</td>
          </tr>`;
          dataTable.insertAdjacentHTML("beforeend", row);
        });
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  }
  