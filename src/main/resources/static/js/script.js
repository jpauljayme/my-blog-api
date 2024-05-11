/* Open when someone clicks on the span element */
function openNav() {
    console.log("open")
    document.getElementsByTagName("nav")[0].style.height = "100%";
  }

  /* Close when someone clicks on the "x" symbol inside the overlay */
function closeNav() {
    document.getElementsByTagName("nav")[0].style.height = "0%";
}