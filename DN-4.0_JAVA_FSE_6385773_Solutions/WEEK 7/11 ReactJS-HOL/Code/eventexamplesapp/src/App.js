import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';
import Welcome from'./components/Welcome'; 
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
    <div className="App">
         <Counter />

         <Welcome />

         <CurrencyConverter />
    </div>
  );
}

export default App;
