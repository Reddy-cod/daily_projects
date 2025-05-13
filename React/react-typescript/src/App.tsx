
import './App.css'
import ExpenseComponent from './components/ExpenseComponent';

interface GreetingsProp{
  name: string;
  city: string;
}
const headlineClass = "red";
function Greetings({name, city}:GreetingsProp) {
  return (
    <>
      <h2 className={headlineClass}>Hello {name} from {city}</h2>
    </>
  )
}
function App() {
  return (
    <>
      <Greetings name="IBMer" city="bangalore" />
      <ExpenseComponent/>
    </>
  )
}
interface ActionButtonProps{
  title: string;
  disabled: boolean;
}

function handleClick() {
  alert('Button Clicked');
}

function ActionButton({ title, disabled }: ActionButtonProps) {
  return (
    <>
      <button disabled={disabled} onClick={handleClick}>{title}</button>
    </>
  )
}
export default App
