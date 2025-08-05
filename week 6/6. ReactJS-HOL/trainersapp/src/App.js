import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import TrainerList from "./TrainerList";
import TrainerDetails from "./TrainerDetails";
import Home from "./Home";
import trainersMock from "./TrainersMock"; 

const App = () => {
  return (
    <BrowserRouter>
      <div>
        <h2>My Academy Trainers App</h2>
        <Link to="/home">Home</Link>
        <span> | </span>
        <Link to="/trainers">Show Trainers</Link>
      </div>

      <Routes>
        <Route path={"/home"} element={<Home />} />
        <Route
          path={"/trainers"}
          element={<TrainerList trainers={trainersMock} />}
        />
        <Route
          path={"/trainers/:trainerId"}
          element={<TrainerDetails trainers={trainersMock} />}
        />
      </Routes>
    </BrowserRouter>
  );
};

export default App;