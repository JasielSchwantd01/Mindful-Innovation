-- Mindful Innovation

-- Global Variables
local mindfulInnovation = {};
local currentIndex = 1;

-- Functions

-- This function updates the mindful Innovation table, creating entries for each item as needed.
function mindfulInnovation.updateTable(value)
	mindfulInnovation[currentIndex] = value;
	currentIndex = currentIndex + 1;
end

-- This function returns the current mindful Innovation table
function mindfulInnovation.getTable()
	return mindfulInnovation;
end

-- This function clears the mindful Innovation table, resetting the index to 1.
function mindfulInnovation.clearTable()
	mindfulInnovation = {};
	currentIndex = 1;
end

-- This function returns a random item from the mindful Innovation table.
function mindfulInnovation.getRandomItem()
	local index = math.random(1, currentIndex - 1);
	return mindfulInnovation[index];
end

-- This function sorts the mindful Innovation table in ascending order.
function mindfulInnovation.sortTable()
	table.sort(mindfulInnovation);
end

-- This function prints the contents of the mindful Innovation table.
function mindfulInnovation.printTable()
	for i,v in ipairs(mindfulInnovation) do
		print("Index: "..i..", Value: "..v);
	end
end

-- This function searches the mindful Innovation table for a specific value
function mindfulInnovation.searchTable(value)
	local foundIndex = 0;
	for i,v in ipairs(mindfulInnovation) do
		if v == value then
			foundIndex = i;
			break;
		end
	end
	return foundIndex;
end

-- This function adds an item to the mindful Innovation table at a specific index
function mindfulInnovation.addAtIndex(value, index)
	table.insert(mindfulInnovation, index, value);
	currentIndex = currentIndex + 1;
end

-- This function removes an item from the mindful Innovation table at a specific index
function mindfulInnovation.removeAtIndex(index)
	table.remove(mindfulInnovation, index);
	currentIndex = currentIndex - 1;
end

-- This function swaps the values of two items in the mindful Innovation table
function mindfulInnovation.swapValues(index1, index2)
	local temp = mindfulInnovation[index1];
	mindfulInnovation[index1] = mindfulInnovation[index2];
	mindfulInnovation[index2] = temp;
end

-- This function returns the first item in the mindful Innovation table
function mindfulInnovation.getFirstItem()
	return mindfulInnovation[1];
end

-- This function returns the last item in the mindful Innovation table
function mindfulInnovation.getLastItem()
	return mindfulInnovation[currentIndex - 1];
end

return mindfulInnovation;