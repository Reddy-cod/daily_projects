
import './App.css'

interface GreetingsProp{
  name: string;
  city: string;
}
function Greetings({name, city}:GreetingsProp) {
  return (
    <>
      <h2>Hello {name} from {city}</h2>
    </>
  )
}
function App() {
  return (
    <>
     <Greetings name="IBMer" city ="bangalore"/>
    </>
  )
}

export default App
